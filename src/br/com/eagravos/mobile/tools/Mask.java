package br.com.eagravos.mobile.tools;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Simula uma máscara em campos
 * de edição
 * @author Jansen Felipe ==>> http://www.jansenfelipe.com.br/android-como-inserir-mascara-em-um-edittext/
 *
 */
public abstract class Mask {

	/**
	 * Retira a máscara da string
	 * @param s
	 * @return
	 */
	public static String unmask(String s) {
		if (s != null) {
			return s.replaceAll("[.]", "").replaceAll("[-]", "")
					.replaceAll("[/]", "").replaceAll("[(]", "")
					.replaceAll("[)]", "");
		}
		return s;
	}

	public static TextWatcher insert(final String mask, final EditText ediTxt) {
		return new TextWatcher() {
			boolean isUpdating;
			String old = "";

			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				String str = Mask.unmask(s.toString());
				String mascara = "";
				if (isUpdating) {
					old = str;
					isUpdating = false;
					return;
				}
				int i = 0;
				for (char m : mask.toCharArray()) {
					if (m != '#' && str.length() > old.length()) {
						mascara += m;
						continue;
					}
					try {
						mascara += str.charAt(i);
					} catch (Exception e) {
						break;
					}
					i++;
				}
				isUpdating = true;
				ediTxt.setText(mascara);
				ediTxt.setSelection(mascara.length());
			}

			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				
			}

			public void afterTextChanged1(Editable s) {
				
			}

			@Override
			public void afterTextChanged(Editable s) {

			}
		};
	}
}
