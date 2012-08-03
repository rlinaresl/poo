/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;

public class Validation 
{

  private static String regexAlphanumeric = "^([a-z]|[A-Z]|[\\d])*$";
  private static String regexAlphanumericSpace = "^([a-z]|[A-Z]|[\\d]|[\\s])*$";
  private static String regexAlphanumericSpaceAccent = "^([a-z]|[A-Z]|[áéíóúAÉ�?ÓÚÑñ]|[\\d]|[\\s])*$";
  private static String regexUrl = "^(http|https|ftp)://([a-zA-Z0-9.\\-]+(:[a-zA-Z0-9.&amp;%$\\-]+)*@)*((25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])|localhost|([a-zA-Z0-9\\-]+\\.)*[a-zA-Z0-9\\-]+\\.(com|edu|gov|int|mil|net|org|biz|arpa|info|name|pro|aero|coop|museum|[a-zA-Z]{2}))(:[0-9]+)*(/($|[a-zA-Z0-9.,?'\\\\+&amp;%$#=~_\\-]+))*$";
  private static String regexLetters = "^([a-z]|[A-Z]|[áéíóú�?É�?ÓÚÑñü])*$";
  private static String regexLettersSpace = "^([a-z]|[A-Z]|[áéíóúAÉ�?ÓÚÑñü]|[\\s])*$";
  private static String regexOnlyLettersSpace = "^([a-z]|[A-Z]|[\\s])*$";
  private static String regexEmail = "^([A-Za-z0-9_\\-.])+@([A-Za-z0-9_\\-.])+\\.([A-Za-z]{2,4})$";
  private static String regexNumber = "^[0-9]*$";
  private static String regexNumberSpace = "^([0-9]|[\\s])*$";
  private static String inputStyle = "border-color:#FF0000;border-style:solid";
  private static String inputClearStyle = "border-color:#C0C0C0;border-style:inset";

  public static boolean isEmpty(Object var) {
    if (var instanceof List) {
      if (((List) var).isEmpty()) {
        return true;
      }
    }
    if (var.toString().isEmpty()) {
      return true;
    }
    return false;
  }

  public static boolean isEmpty2(Object var) {
    if (var instanceof List) {
      if (((List) var).isEmpty()) {
        return true;
      }
    }
    if (var.toString().isEmpty()) {
      return true;
    }
    return false;
  }

  public static boolean isAlphanumeric(Object var) {
    if (var.toString().matches(regexAlphanumeric)) {
      return true;
    }
    return false;
  }

  public static boolean isAlphanumericSpace(Object var) {
    if (var.toString().matches(regexAlphanumericSpace)) {
      return true;
    }
    return false;
  }

  public static boolean validateLength(Object var, int min, int max) {
    if (var.toString().length() > max || var.toString().length() < min) {
      return true;
    }
    return false;
  }

  public static boolean isBlankSpaces(Object var) {
    if (var.toString().indexOf(" ") > -1) {
      return true;
    }
    return false;
  }

  public static boolean isURL(Object var) {
    if (var.toString().isEmpty() || var.toString().matches(regexUrl)) {
      return true;
    }
    return false;

  }

  public static boolean isLetter(Object var) {
    if (var.toString().matches(regexLetters)) {
      return true;
    }
    return false;
  }

  public static boolean isNotLetter(Object var) {
    if (!var.toString().matches(regexLetters)) {
      return true;
    }
    return false;
  }

  public static boolean isLetterSpace(Object var) {
    if (var.toString().matches(regexLettersSpace)) {
      return true;
    }
    return false;
  }

  public static boolean isEmail(Object var) {
    if (var.toString().matches(regexEmail)) {
      return true;
    }
    return false;
  }

  public static boolean isNumber(Object var) {
    if (var.toString().matches(regexNumber)) {
      return true;
    }
    return false;
  }

  public static boolean isNotNumber(Object var) {
    if (!var.toString().matches(regexNumber)) {
      return true;
    }
    return false;
  }

  public static boolean isNotNumberSpace(Object var) {
    if (!var.toString().matches(regexNumberSpace)) {
      return true;
    }
    return false;
  }
  
  public static boolean isAlphanumericSpaceAccent(Object var) {
    if (var.toString().matches(regexAlphanumericSpaceAccent)) {
      return true;
    }
    return false;
  }

  public static boolean isOnlyLetterSpace(Object var) {
    if (var.toString().matches(regexOnlyLettersSpace)) {
      return true;
    }
    return false;
  }
  
}