package com.alexandredresch.infinityinn.exception;

import java.sql.SQLException;

public class PhotoRetrievalException extends RuntimeException {
    public PhotoRetrievalException(String message){
        super(message);
    }
}
