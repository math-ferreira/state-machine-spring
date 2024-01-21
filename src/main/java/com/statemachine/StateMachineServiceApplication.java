package com.statemachine;

import com.statemachine.enums.OrderEvents;
import com.statemachine.enums.OrderStates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class StateMachineServiceApplication implements CommandLineRunner {

	@Autowired
	private StateMachine<OrderStates, OrderEvents> stateMachine;

	public static void main(String[] args) {
		SpringApplication.run(StateMachineServiceApplication.class, args);
	}

	@Override
	public void run(String... args) {

		System.out.println("Starting state machine");

		stateMachine.sendEvent(OrderEvents.CONFIRMED_PAYMENT);
		stateMachine.sendEvent(OrderEvents.INVOICE_ISSUED);
		stateMachine.sendEvent(OrderEvents.SHIP);
		stateMachine.sendEvent(OrderEvents.DELIVER);

		System.out.println("State machine has been completed");
	}

}
