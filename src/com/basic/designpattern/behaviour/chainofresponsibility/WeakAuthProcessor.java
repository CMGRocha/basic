package com.basic.designpattern.behaviour.chainofresponsibility;

public class WeakAuthProcessor extends AuthenticationProcessor {


    public WeakAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof WeakAuthProcessor) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }
}