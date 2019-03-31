package com.basic.designpattern.behaviour.chainofresponsibility;

public class Main {

    public static void main(String[] args) {

        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        boolean isAuthorized = authProcessorChain.isAuthorized(new OAuthTokenProvider());
        System.out.println(isAuthorized);
        boolean isAuthorized2 = authProcessorChain.isAuthorized(new WeakAuthProvider());
        System.out.println(isAuthorized2);
    }

    private static AuthenticationProcessor getChainOfAuthProcessor() {

        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        AuthenticationProcessor unamePasswordProcessor = new UsernamePasswordProcessor(oAuthProcessor);
        AuthenticationProcessor weakAuthProcessor = new WeakAuthProcessor(null);

        return unamePasswordProcessor;
    }
}
