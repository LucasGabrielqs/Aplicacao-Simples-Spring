package dsd.com.Atv_Endpoint.service;

import org.springframework.stereotype.Service;

@Service
public class PersonalizeMessageService {
    public String Msg_Customer(String name){
        return "Mensagem personalizada entregue com sucesso, " + name;
    }
}
