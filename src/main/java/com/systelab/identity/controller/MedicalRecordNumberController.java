package com.systelab.identity.controller;

import com.systelab.identity.util.InvalidNumberException;
import com.systelab.identity.util.MedicalRecordNumberValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "Medical Record Number", description = "API for Medical Record Number", tags = {"Medical Record Number"})
@RestController()
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "Authorization", allowCredentials = "true")
@RequestMapping(value = "/identity/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class MedicalRecordNumberController {

    @ApiOperation(value = "Check a Medical Record Number")
    @GetMapping("medical-record-number/{number}")
    public ResponseEntity checkRecordNumber(@PathVariable("number") String number) {
        if (MedicalRecordNumberValidator.isValid(number))
            return ResponseEntity.ok().build();
        else
            throw new InvalidNumberException(number);
    }
}