package guru.oussama.blog.hexarchi.infra.adapters;

import guru.oussama.blog.hexarchi.domain.entities.PhoneBook;
import guru.oussama.blog.hexarchi.domain.port.outgoing.LoadPhoneBookPort;
import guru.oussama.blog.hexarchi.infra.respository.PhoneBookRepository;

import java.util.Optional;

public class LoadPhoneBookAdapter implements LoadPhoneBookPort {

    private PhoneBookRepository phoneBookRepository;

    public LoadPhoneBookAdapter(PhoneBookRepository phoneBookRepository) {
        this.phoneBookRepository = phoneBookRepository;
    }

    @Override
    public Optional<PhoneBook> load(Long id) {
        return phoneBookRepository.load(id);
    }
}
