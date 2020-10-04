package guru.oussama.blog.hexarchi.app.cli;

import guru.oussama.blog.hexarchi.domain.port.ingoing.AddPhoneNumberPort;
import guru.oussama.blog.hexarchi.domain.port.outgoing.LoadPhoneBookPort;
import guru.oussama.blog.hexarchi.domain.port.outgoing.SavePhoneBookPort;
import guru.oussama.blog.hexarchi.domain.usecase.PhoneBookAddService;
import guru.oussama.blog.hexarchi.infra.adapters.LoadPhoneBookAdapter;
import guru.oussama.blog.hexarchi.infra.adapters.SavePhoneBookAdapter;
import guru.oussama.blog.hexarchi.infra.respository.PhoneBookRepository;

public class PhoneBookApp {
    private AddPhoneNumberPort addPhoneNumberService;
    private PhoneBookRepository phoneBookRepository;
    private SavePhoneBookPort savePhoneBookAdapter;
    private LoadPhoneBookPort loadPhoneBookAdapter;

    public static void main(String[] args) {
        new PhoneBookApp().init();
    }

    public void init() {
        phoneBookRepository = new PhoneBookRepository();
        savePhoneBookAdapter = new SavePhoneBookAdapter(phoneBookRepository);
        loadPhoneBookAdapter = new LoadPhoneBookAdapter(phoneBookRepository);
        addPhoneNumberService = new PhoneBookAddService(loadPhoneBookAdapter, savePhoneBookAdapter);
        addPhoneNumberService.add(100L, "064502131");
    }
}
