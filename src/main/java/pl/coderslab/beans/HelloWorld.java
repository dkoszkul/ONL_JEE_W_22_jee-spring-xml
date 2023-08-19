package pl.coderslab.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorld {
    private String message;

    public void printMessage() {
        System.out.println("Your Message : " + message);
    }
}
