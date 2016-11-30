package com.example.jean.jcplayer.JcPlayerExceptions;

/**
 * Created by jean on 01/09/16.
 */

public class AudioInvalidPathException extends IllegalStateException{
    public AudioInvalidPathException(String url){
        super("The url does not appear valid: " + url);
    }
}
