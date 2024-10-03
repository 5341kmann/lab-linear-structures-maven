package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+

  /**
   * Determine whether the parens match in string.
   */
  public static boolean checkMatching(String str) {
    Stack<Character> parens = new LinkedStack<Character>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(' || str.charAt(i) == '[') {
        try {
          parens.push(str.charAt(i));
        } catch (Exception e) {
        } //try/catch
      } // if
      if (str.charAt(i) == ')' || str.charAt(i) == ']') {
        try {
          char recent = parens.pop();
          if ((recent == '(' && str.charAt(i) == ')') || (recent == '[' && str.charAt(i) == ']')) {
            return true;
          } // if
        } catch (Exception e) {
        } //try/catch
      }
    } // for
    return false;
  } //checkMatching(String)
}
// class StringUtils

