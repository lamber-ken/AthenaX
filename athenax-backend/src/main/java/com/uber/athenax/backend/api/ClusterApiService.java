package com.uber.athenax.backend.api;

import com.uber.athenax.backend.api.*;
import com.uber.athenax.backend.api.*;

import com.sun.jersey.multipart.FormDataParam;

import com.uber.athenax.backend.api.ClusterInfo;

import java.util.List;
import com.uber.athenax.backend.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-08-21T21:38:44.857+08:00")
public abstract class ClusterApiService {
      public abstract Response getClusterInfo(SecurityContext securityContext)
      throws NotFoundException;
}
