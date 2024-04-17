package com.pruebas;

import com.example.demo.service.SmartPhoneService;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartPhoneServiceImplTest {

    @Test
    void countTest() {
        SmartPhoneService smartPhoneService = new SmartPhoneServiceImpl();

        // 3.1 Verificar si devuelve null
        assertNotNull(smartPhoneService.count());

        // 3.2 Verificar si el valor que devuelve es mayor que 0
        assertTrue(smartPhoneService.count() > 0);

        // 3.3 Verificar que el valor es igual a 3
        assertEquals(3, smartPhoneService.count());

        // 4 caso donde el test falla
        assertTrue(smartPhoneService.count() < 0);

    }

    @Test
    void findOneTest() {
        SmartPhoneService smartPhoneService = new SmartPhoneServiceImpl();

        // Verificar que al pasarle un id null, lanza la excepcion IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> { smartPhoneService.findOne(null); });
    }

    @Test
    void juntarAserciones(){
        SmartPhoneService smartPhoneService = new SmartPhoneServiceImpl();

        // Probar que cada una de las aserciones se ejecuta de manera independiente pero todas a la vez
        assertAll(
                () ->   assertNotNull(smartPhoneService.count()),
                () -> assertTrue(smartPhoneService.count() > 0),
                () -> assertEquals(3, smartPhoneService.count())
        );
    }

}
