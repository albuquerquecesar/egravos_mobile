package br.com.eagravos.mobile.validators;

import net.sf.oval.Validator;
import net.sf.oval.configuration.annotation.AbstractAnnotationCheck;
import net.sf.oval.context.OValContext;
import net.sf.oval.exception.OValException;

public class CPFValidator extends AbstractAnnotationCheck<CPF> {

	@Override
	public boolean isSatisfied(Object arg0, Object arg1, OValContext arg2,
			Validator arg3) throws OValException {
		// TODO Auto-generated method stub
		return CPFValidator.validarCPF(arg1.toString());
	}

	public static boolean validarCPF(String cpf) {
		if (cpf != null) {
			//deve ser um número de 11 dígitos
			if (cpf.matches("\\d{11}")) {
				int d1, d2;
				int digito1, digito2, resto;
				int digitoCPF;
				String nDigResult;

				d1 = d2 = 0;
				digito1 = digito2 = resto = 0;

				for (int nCount = 1; nCount < cpf.length() - 1; nCount++) {
					digitoCPF = Integer.valueOf(
							cpf.substring(nCount - 1, nCount)).intValue();

					// multiplique a ultima casa por 2 a seguinte por 3 a
					// seguinte
					// por 4 e assim por diante.
					d1 = d1 + (11 - nCount) * digitoCPF;

					// para o segundo digito repita o procedimento incluindo o
					// primeiro digito calculado no passo anterior.
					d2 = d2 + (12 - nCount) * digitoCPF;
				}
				;

				// Primeiro resto da divisão por 11.
				resto = (d1 % 11);

				// Se o resultado for 0 ou 1 o digito é 0 caso contrário o
				// digito é
				// 11 menos o resultado anterior.
				if (resto < 2)
					digito1 = 0;
				else
					digito1 = 11 - resto;

				d2 += 2 * digito1;

				// Segundo resto da divisão por 11.
				resto = (d2 % 11);

				// Se o resultado for 0 ou 1 o digito é 0 caso contrário o
				// digito é
				// 11 menos o resultado anterior.
				if (resto < 2)
					digito2 = 0;
				else
					digito2 = 11 - resto;

				// Digito verificador do CPF que está sendo validado.
				String nDigVerific = cpf.substring(cpf.length() - 2,
						cpf.length());

				// Concatenando o primeiro resto com o segundo.
				nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

				// comparar o digito verificador do cpf com o primeiro resto + o
				// segundo resto.
				return nDigVerific.equals(nDigResult);
			}
		}

		return false;
	}
}
