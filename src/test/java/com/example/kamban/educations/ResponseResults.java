package com.example.kamban.educations;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.io.IOUtils;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

@Setter
@Getter
public class ResponseResults {
    private final ClientHttpResponse theResponse;
    private final String body;

    ResponseResults(final ClientHttpResponse response) throws IOException {
        this.theResponse = response;
        final InputStream bodyInputStream = response.getBody();
        final StringWriter stringWriter = new StringWriter();
        IOUtils.copy(bodyInputStream, stringWriter);
        this.body = stringWriter.toString();
    }
}