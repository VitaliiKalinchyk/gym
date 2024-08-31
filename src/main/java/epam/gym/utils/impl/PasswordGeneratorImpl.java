package epam.gym.utils.impl;

import epam.gym.utils.PasswordGenerator;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class PasswordGeneratorImpl implements PasswordGenerator {

    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String ALL_CHARACTERS = UPPER_CASE + LOWER_CASE + DIGITS;
    private static final int PASSWORD_LENGTH = 10;
    private static final Random random = new Random();

    @Override
    public String generatePassword() {
        List<Character> passwordChars = new ArrayList<>();

        passwordChars.add(UPPER_CASE.charAt(random.nextInt(UPPER_CASE.length())));
        passwordChars.add(LOWER_CASE.charAt(random.nextInt(LOWER_CASE.length())));
        passwordChars.add(DIGITS.charAt(random.nextInt(DIGITS.length())));

        IntStream.range(passwordChars.size(), PASSWORD_LENGTH)
                 .mapToObj(i -> ALL_CHARACTERS.charAt(random.nextInt(ALL_CHARACTERS.length())))
                 .forEach(passwordChars::add);

        Collections.shuffle(passwordChars);

        return passwordChars.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}