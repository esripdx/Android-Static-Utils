package com.esri.android.util;

/**
 * A pack of helpful Email utility methods.
 */

public class Email {

    /**
     *
     * Helper method is e-mail for check.
     *
     * @param target Check e-mail valid and invalid.
     * @return true or false valid mail.
     */
    public static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

}
