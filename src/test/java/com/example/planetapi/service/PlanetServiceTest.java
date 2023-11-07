package com.example.planetapi.service;

import static com.example.planetapi.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.planetapi.domain.Planet;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {

    // todo: this test is failing because is missing the stub implementation. Do it
    // with Mockito

    @Autowired
    private PlanetService planetService;

    @Test
    public void createPlanet_withValidData_returnsCreatedPlanet() {

        // SYSTEM UNDER TEST (SUT)
        Planet sut = planetService.create(PLANET);

        // verify state - do not forget implement equals on the Planet class
        assertThat(sut).isEqualTo(PLANET);

    }

}
