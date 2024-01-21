package com.statemachine;

import com.statemachine.enums.EventEnum;
import com.statemachine.enums.StateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class StateMachineServiceApplication implements CommandLineRunner {

	@Autowired
	private StateMachine<StateEnum, EventEnum> stateMachine;

	public static void main(String[] args) {
		SpringApplication.run(StateMachineServiceApplication.class, args);
	}

	@Override
	public void run(String... args) {
		stateMachine.sendEvent(EventEnum.E1);
		stateMachine.sendEvent(EventEnum.E2);
	}

}
