package com.gauravjalal.UserService.exception;

public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound(){
        super("Resource not found on Server !!");

    }
      public ResourceNotFound(String message){
        super(message);
    }



}
