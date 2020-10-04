package guru.oussama.blog.hexarchi.domain.port.outgoing;

import guru.oussama.blog.hexarchi.domain.entities.PhoneBook;

import java.util.Optional;

public interface LoadPhoneBookPort {
    Optional<PhoneBook> load(Long id);
}
