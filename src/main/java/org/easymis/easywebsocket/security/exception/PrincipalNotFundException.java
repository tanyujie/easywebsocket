package org.easymis.easywebsocket.security.exception;

/**
 * SecurityContextHolder.getContext().getAuthentication().getPrincipal()
 */
public class PrincipalNotFundException extends NullPointerException {


    private Class principal;

    public PrincipalNotFundException(String msg, Class principal) {
        super(msg);
        this.principal = principal;
    }

}
