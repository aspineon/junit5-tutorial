package com.howtoprogram.junit5;

public final class StringUtils {

  public static boolean empty(final String s) {
    return s == null || s.trim().isEmpty();
  }

}
