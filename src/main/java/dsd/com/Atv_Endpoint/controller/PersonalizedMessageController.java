package dsd.com.Atv_Endpoint.controller;

import dsd.com.Atv_Endpoint.service.PersonalizeMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/personalized-message")
public class PersonalizedMessageController {

    @Autowired
    private PersonalizeMessageService personalizeMessageService;

    // Este método responde a requisições GET para o endpoint /personalized-message
    @GetMapping
    public String Msg_Customer(){
        return personalizeMessageService.Msg_Customer("Lucas Gabriel");
    }
}
