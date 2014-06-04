package br.com.eagravos.mobile.validators;

import net.sf.oval.Validator;
import net.sf.oval.configuration.annotation.AbstractAnnotationCheck;
import net.sf.oval.context.OValContext;
import net.sf.oval.exception.OValException;

public class CPFCNPJValidator extends AbstractAnnotationCheck<CPFCNPJ>{

	@Override
	public boolean isSatisfied(Object arg0, Object arg1, OValContext arg2,
			Validator arg3) throws OValException {
		return validarCPFCNPJ(arg1.toString());
	}

	public static boolean validarCPFCNPJ(String cpfCnpj){
		if (cpfCnpj != null){
			
			if (cpfCnpj.length()== 11){
				return CPFValidator.validarCPF(cpfCnpj);
			}
			if (cpfCnpj.length() == 14){
				return CNPJValidator.validarCNPJ(cpfCnpj);
			}
		}
		return false;
	}
}
