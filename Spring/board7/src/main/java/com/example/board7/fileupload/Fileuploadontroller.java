package com.example.board7.fileupload;

import com.example.board7.fileupload.model.FileLoadDto;
import com.example.board7.fileupload.model.FileuploadInsDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fileupload")
public class Fileuploadontroller {
    private FileuploadService service;
    private final Logger LOGGER;

    @Autowired
    public Fileuploadontroller(FileuploadService service){
        LOGGER = LoggerFactory.getLogger(Fileuploadontroller.class);
        this.service=service;
    }
    @GetMapping
    public ResponseEntity<Resource> download(FileLoadDto dto) {
        Resource file = service.fileLoad(dto);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, //header 에는 요청 응답하고 자하는 요구사항이
                        "attachment; filename=\"" + file.getFilename() + "\"")
                .body(file); //바디에는 전송하고자 하는 file
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE}) //json으로 날린다면  주소값이 필요함 consumes를 적어준다.
    public void fileupload(@RequestPart FileuploadInsDto dto, @RequestPart MultipartFile img){ //img는 무조건 @RequestPart를 적어준다  스프링이 알아서 MultipartFile 형태로 변환해준다.
        // img는 파일로 날리고 dto는 ??로 날린다
        LOGGER.info("DTO:" + dto);
        LOGGER.info("imgFileName:"+img.getName()); //LOGGER 찍기
        service.fileupload(dto,img); //service한테 fileupload로 전달
    }


}