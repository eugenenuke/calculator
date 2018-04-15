package com.eugenenuke.calculator;

import org.springframework.stereotype.Service;

/**
 * Implement summarization
 */
@Service
public class Calculator {
	int sum(int a, int b) {
		return a + b;
	}
}
