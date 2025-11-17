package com.datazuul.lobid;

import com.datazuul.lobid.model.LobidCorporateBody;
import com.datazuul.lobid.model.LobidEvent;
import com.datazuul.lobid.model.LobidFamily;
import com.datazuul.lobid.model.LobidHeadword;
import com.datazuul.lobid.model.LobidOrganisation;
import com.datazuul.lobid.model.LobidPerson;
import com.datazuul.lobid.model.LobidPlace;
import com.datazuul.lobid.model.LobidSearchPersons;
import com.datazuul.lobid.model.LobidWork;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LobidObjectMapperTest {
    private static LobidObjectMapper LOBID_OBJECT_MAPPER;

    @BeforeAll
    static void beforeAll() {
        LOBID_OBJECT_MAPPER = new LobidObjectMapper();
    }

    @Test
    void testLobidCorporateBodyDeserialization() throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource("examples/LobidCorporateBody.json").toURI().toURL();
        LobidCorporateBody lobidCorporateBody = LOBID_OBJECT_MAPPER.readValue(url, LobidCorporateBody.class);
        assertNotNull(lobidCorporateBody);
        assertEquals("Bibliographisches Institut (Leipzig)", lobidCorporateBody.getPreferredName());
    }

    @Disabled
    @Test
    void testLobidCorporateBodyDeserializationFromRemoteUrl() throws IOException {
        URL url = URI.create("https://lobid.org/gnd/2004604-2.json").toURL();
        LobidCorporateBody lobidCorporateBody = LOBID_OBJECT_MAPPER.readValue(url, LobidCorporateBody.class);
        assertNotNull(lobidCorporateBody);
        assertEquals("Bibliographisches Institut (Leipzig)", lobidCorporateBody.getPreferredName());
    }

    @Test
    void testLobidEventDeserialization() throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource("examples/LobidEvent.json").toURI().toURL();
        LobidEvent lobidEvent = LOBID_OBJECT_MAPPER.readValue(url, LobidEvent.class);
        assertNotNull(lobidEvent);
        assertEquals("Dreißigjähriger Krieg", lobidEvent.getPreferredName());
    }

    @Test
    void testLobidFamilyDeserialization() throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource("examples/LobidFamily.json").toURI().toURL();
        LobidFamily lobidFamily = LOBID_OBJECT_MAPPER.readValue(url, LobidFamily.class);
        assertNotNull(lobidFamily);
        assertEquals("Fugger, Familie : 14. Jh.- : Augsburg", lobidFamily.getPreferredName());
    }

    @Test
    void testLobidHeadwordDeserialization() throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource("examples/LobidHeadword.json").toURI().toURL();
        LobidHeadword lobidHeadword = LOBID_OBJECT_MAPPER.readValue(url, LobidHeadword.class);
        assertNotNull(lobidHeadword);
        assertEquals("Weltall", lobidHeadword.getPreferredName());
    }

    @Test
    void testLobidOrganisationDeserialization() throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader()
                .getResource("examples/LobidOrganisation-Alexana.json")
                .toURI().toURL();
        LobidOrganisation lobidOrganisation = LOBID_OBJECT_MAPPER.readValue(url, LobidOrganisation.class);
        assertNotNull(lobidOrganisation);

        // vorhandener Test
        assertEquals("Bibliothek Alexana", lobidOrganisation.getName());

        // weitere Felder
        assertNotNull(lobidOrganisation.getId());
        assertTrue(lobidOrganisation.getId().startsWith("http://"), "Id sollte eine URL sein");

        // Typ(en)
        assertNotNull(lobidOrganisation.getType());
        assertFalse(lobidOrganisation.getType().isEmpty(), "Typ-Liste darf nicht leer sein");

        // Geo/Location (falls vorhanden)
        if (lobidOrganisation.getLocation() != null && !lobidOrganisation.getLocation().isEmpty()) {
            var firstLocation = lobidOrganisation.getLocation().get(0);
            assertNotNull(firstLocation.getGeo());
            assertNotNull(firstLocation.getGeo().getLat());
            assertNotNull(firstLocation.getGeo().getLon());
        }

        // sameAs Links (falls vorhanden) / see @JsonIgnore in LobidOrganisation
        /*
        if (lobidOrganisation.getSameAs() != null) {
            assertFalse(lobidOrganisation.getSameAs().isEmpty());
            assertTrue(lobidOrganisation.getSameAs().get(0).startsWith("http"));
        }
         */
    }


    @Test
    void testLobidPersonDeserialization() throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource("examples/LobidPerson.json").toURI().toURL();
        LobidPerson lobidPerson = LOBID_OBJECT_MAPPER.readValue(url, LobidPerson.class);
        assertNotNull(lobidPerson);
        assertEquals("Goethe, Johann Wolfgang von", lobidPerson.getPreferredName());

        assertEquals("https://d-nb.info/standards/vocab/gnd/gender#male", lobidPerson.getGender().get(0).getId());
    }

    @Test
    void testLobidPlaceDeserialization() throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource("examples/LobidPlace.json").toURI().toURL();
        LobidPlace lobidPlace = LOBID_OBJECT_MAPPER.readValue(url, LobidPlace.class);
        assertNotNull(lobidPlace);
        assertEquals("Weimar", lobidPlace.getPreferredName());
    }

    @Test
    void testLobidWorkDeserialization() throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource("examples/LobidWork.json").toURI().toURL();
        LobidWork lobidWork = LOBID_OBJECT_MAPPER.readValue(url, LobidWork.class);
        assertNotNull(lobidWork);
        assertEquals("Faust, 1, 1770-1850", lobidWork.getPreferredName());
    }

    @Test
    void testLobidSearchPersonsDeserialization() throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource("examples/LobidSearchPersons.json").toURI().toURL();
        LobidSearchPersons lobidSearchPersons = LOBID_OBJECT_MAPPER.readValue(url, LobidSearchPersons.class);
        assertNotNull(lobidSearchPersons);
        assertEquals("Eichinger, Franz", lobidSearchPersons.getMember().get(0).getPreferredName());
    }

}