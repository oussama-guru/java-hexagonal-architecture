package guru.oussama.blog.hexarchi.infra.respository;

import guru.oussama.blog.hexarchi.domain.entities.PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PhoneBookRepository {

    List<PhoneBook> phoneBooks = new ArrayList<>();

    public void save(PhoneBook phoneBook) {
        phoneBooks.add(phoneBook);
    }

    public Optional<PhoneBook> load(Long id) {
        return phoneBooks.stream().filter(phoneBook -> phoneBook.getId().equals(id)).findFirst();
    }
}