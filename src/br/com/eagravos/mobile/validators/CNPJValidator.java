package br.com.eagravos.mobile.validators;

import net.sf.oval.Validator;
import net.sf.oval.configuration.annotation.AbstractAnnotationCheck;
import net.sf.oval.context.OValContext;
import net.sf.oval.exception.OValException;

public class CNPJValidator extends AbstractAnnotationCheck<CNPJ> {

	@Override
	public boolean isSatisfied(Object arg0, Object arg1, OValContext arg2,
			Validator arg3) throws OValException {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean validarCNPJ(String str_cnpj) {
		if (str_cnpj != null) {
			if (str_cnpj.matches("\\d{14}")) {
				int soma = 0, aux, dig;
				String cnpj_calc = str_cnpj.substring(0, 12);

				char[] chr_cnpj = str_cnpj.toCharArray();

				/* Primeira parte */
				for (int i = 0; i < 4; i++)
					if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9)
						soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
				for (int i = 0; i < 8; i++)
					if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9)
						soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
				dig = 11 - (soma % 11);

				cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer
						.toString(dig);

				/* Segunda parte */
				soma = 0;
				for (int i = 0; i < 5; i++)
					if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9)
						soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
				for (int i = 0; i < 8; i++)
					if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9)
						soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
				dig = 11 - (soma % 11);
				cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer
						.toString(dig);

				return str_cnpj.equals(cnpj_calc);
			}

		}
		return false;
	}

}
