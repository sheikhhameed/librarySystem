package org.example.controllers;

//import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.example.dto.ResponseData;
import org.example.entity.Borrower;
import org.example.services.LibraryServices;
import org.example.util.CommonResponseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryControllers {

    public static final Logger LOGGER = LoggerFactory.getLogger(LibraryControllers.class);

    @Autowired
    LibraryServices libraryServices;

    @PostMapping(value = "registerborrower")
//    @OpenAPIDefinition(info = "register Borrower to library")
//    @ApiResponses({
//            @ApiResponse(code=200, message = "Borrower created successfully!"),
//            @ApiResponse(code=401, message="Not Authorize to create Borrower"),
//            @ApiResponse(code=403, message="Adding Borrower is forbidden"),
//            @ApiResponse(code=404, message="Not allowed to add Borrower")
//    })
    public ResponseEntity<ResponseData> registerBorrower(@RequestBody Borrower borrower){

        LOGGER.info("Entering into registerBorrower");
        Borrower borrowerResp = libraryServices.createBorrower(borrower);
        ResponseData response = CommonResponseUtils.responseObj(HttpStatus.CREATED.toString(), borrowerResp.getId(), "Borrower created successfully");
        LOGGER.debug("Exiting from registerBorrower method : Borrower created successfully : ");
        ResponseEntity<ResponseData> responseDataResponseEntity = new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.OK);
        return responseDataResponseEntity;
    }

}
