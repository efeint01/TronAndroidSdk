package com.efeint.tronsdk.abi.datatypes.generated;

import com.efeint.tronsdk.abi.datatypes.Uint;

import java.math.BigInteger;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.web3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint240 extends Uint {
    public static final Uint240 DEFAULT = new Uint240(BigInteger.ZERO);

    public Uint240(BigInteger value) {
        super(240, value);
    }

    public Uint240(long value) {
        this(BigInteger.valueOf(value));
    }
}
