package edu.learn.didemo.examplebean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FakeJmsBroker {
    private String username;
    private String password;
    private String URL;
}
