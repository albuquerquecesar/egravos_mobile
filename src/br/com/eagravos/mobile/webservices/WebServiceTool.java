package br.com.eagravos.mobile.webservices;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



import android.os.AsyncTask;
import android.os.Build;
import br.com.eagravos.mobile.modelos.Contatos;
import br.com.eagravos.mobile.tools.Criptografia;
import br.com.eagravos.mobile.tools.ApplicationEagravosMobile;

public class WebServiceTool {

	private static int TIME_OUT = 20000;
	private static final String USERNAME = "mobile@saudecaruaru.pe.gov.br";
	private static final String PASSWORD = "2013@saudecaruaru.pe.gov.br";
	private static final String HEADER_USER = "INSPETORWEBUSERNAME";
	private static final String HEADER_PASSWORD = "INSPETORWEBPASSWORD";
	private static final String HEADER_TOKEN = "APITOKEN";
	private static final String TOKEN_SEPARATOR = "::::";

	public static final String HOST ="http://10.0.0.57:8084/Eagravos/rest/";
	

	public static JSONObject requestWebService(String serviceUrl) {
		HttpURLConnection urlConnection = null;
		try {
			disableConnectionReuseIfNecessary();
			// create connection
			URL urlToRequest = new URL(serviceUrl);
			urlConnection = (HttpURLConnection) urlToRequest.openConnection();
			// 10 segundos
//			urlConnection.addRequestProperty(HEADER_USER, USERNAME);
//			urlConnection.addRequestProperty(HEADER_PASSWORD, PASSWORD);
//			urlConnection.addRequestProperty(HEADER_TOKEN,
//					generateToken(serviceUrl));
			urlConnection.setConnectTimeout(TIME_OUT);
			urlConnection.setReadTimeout(TIME_OUT);

			// handle issues
			int statusCode = urlConnection.getResponseCode();
			if (statusCode == HttpURLConnection.HTTP_UNAUTHORIZED) {
				// handle unauthorized (if service requires user login)
			} else if (statusCode != HttpURLConnection.HTTP_OK) {
				// handle any other errors, like 404, 500,..
			}

			// create JSON object from content
			InputStream in = new BufferedInputStream(
					urlConnection.getInputStream());
			return new JSONObject(getResponseText(in));

		} catch (MalformedURLException e) {
			// URL is invalid
			e.printStackTrace();
		} catch (SocketTimeoutException e) {
			// data retrieval or connection timed out
			e.printStackTrace();
		} catch (IOException e) {
			// could not read response body
			// (could not create input stream)
			e.printStackTrace();
		} catch (JSONException e) {
			// response body is no valid JSON string
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (urlConnection != null) {
				urlConnection.disconnect();
			}
		}
		return null;
	}
	
	public static JSONObject requestPostWebService(String serviceUrl,
			String data) {
		HttpURLConnection urlConnection = null;
		try {
			String dataEncode=data;//URLEncoder.encode(data, "UTF-8");
			disableConnectionReuseIfNecessary();
			// create connection
			URL urlToRequest = new URL(serviceUrl);
			urlConnection = (HttpURLConnection) urlToRequest.openConnection(Proxy.NO_PROXY);

			urlConnection.addRequestProperty(HEADER_USER, USERNAME);
			urlConnection.addRequestProperty(HEADER_PASSWORD, PASSWORD);
			urlConnection.setRequestProperty("Content-Type", "application/json");
			urlConnection.setRequestProperty("Accept", "application/json");
			urlConnection.setRequestProperty("charset", "utf-8");
			urlConnection.setRequestProperty("Content-Length", "" + Integer.toString(dataEncode.getBytes().length));
                        urlConnection.setUseCaches (false);
			urlConnection.setRequestMethod("POST");
			urlConnection.setConnectTimeout(TIME_OUT);
			urlConnection.setReadTimeout(TIME_OUT);

			// envia os dados
			urlConnection.setDoOutput(true);
			urlConnection.setDoInput(true);
			urlConnection.connect();
			DataOutputStream wr = new DataOutputStream(

			urlConnection.getOutputStream());
			wr.writeBytes(dataEncode);
			wr.flush();
			wr.close();
			//urlConnection.connect();
			// handle issues
			int statusCode = urlConnection.getResponseCode();
			if (statusCode == HttpURLConnection.HTTP_UNAUTHORIZED) {
				// handle unauthorized (if service requires user login)
			} else if (statusCode != HttpURLConnection.HTTP_OK) {
				// handle any other errors, like 404, 500,..
			}

			// create JSON object from content
			InputStream in = new BufferedInputStream(
					urlConnection.getInputStream());
			return new JSONObject(getResponseText(in));

		} catch (MalformedURLException e) {
			// URL is invalid
			e.printStackTrace();
		} catch (SocketTimeoutException e) {
			// data retrieval or connection timed out
			e.printStackTrace();
		} catch (IOException e) {
			// could not read response body
			// (could not create input stream)
			e.printStackTrace();
		} catch (JSONException e) {
			// response body is no valid JSON string
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (urlConnection != null) {
				urlConnection.disconnect();
			}
		}
		return null;
	}

	/**
	 * required in order to prevent issues in earlier Android version.
	 */
	private static void disableConnectionReuseIfNecessary() {
		// see HttpURLConnection API doc
		if (Integer.parseInt(Build.VERSION.SDK) < Build.VERSION_CODES.FROYO) {
			System.setProperty("http.keepAlive", "false");
		}
	}

	private static String getResponseText(InputStream inStream) {
		// very nice trick from
		// http://weblogs.java.net/blog/pat/archive/2004/10/stupid_scanner_1.html
		return new Scanner(inStream).useDelimiter("\\A").next();
	}

	private static String generateToken(String url) {
		Contatos user = ApplicationEagravosMobile.getConnectedUser();
		if (user != null) {
			StringBuilder builder = new StringBuilder();
			builder.append(url);
			builder.append(user.getSenha());
			builder.append(user.getEmail());

			String hash = Criptografia.criptografe(builder.toString(),
					Criptografia.SHA1);
			return user.getNome() + TOKEN_SEPARATOR + hash;
		}
		return "";
	}
}
