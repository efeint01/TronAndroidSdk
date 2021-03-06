package com.efeint.tronsdk.core.config;

public interface Parameter {

  interface CommonConstant {
      byte ADD_PRE_FIX_BYTE = (byte) 0x41;
    byte ADD_PRE_FIX_BYTE_MAINNET = (byte) 0x41;   //41 + address
    byte ADD_PRE_FIX_BYTE_TESTNET = (byte) 0xa0;   //a0 + address
    int ADDRESS_SIZE = 21;
  }

}
