package com.batch.job;

import com.batch.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;
@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, String> {


    //Processamento linha por linha do arquivo csv
    @Override
    public String process(Person person) throws Exception {

        String greeting = "Hello " + person.getFirstName() + " " + person.getLastName() + "!";
        log.info("converting '{}' into '{}'", person, greeting);
        return greeting;
    }
}
