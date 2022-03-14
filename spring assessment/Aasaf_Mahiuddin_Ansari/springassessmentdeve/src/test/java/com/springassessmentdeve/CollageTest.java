package com.springassessmentdeve;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springassessmentdeve.controller.CollageController;
@SpringBootTest
class CollageTest {
	@Autowired
	CollageController collageController;

	@Test
	public void testforNotNullInCollageData() throws Exception {
		assertThat(collageController).isNotNull();
	}

}
