# datazuul libs: lobid.org GND entityfacts API

Java-Library for mapping JSON-LD of https://lobid.org/gnd/api API to Java POJOs.

## Usage

Add Maven dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>com.datazuul.lobid</groupId>
  <artifactId>lobid-entityfacts-api</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

Get JSON from URL and map to Java POJO:

```java
import com.datazuul.lobid.LobidObjectMapper;
import com.datazuul.lobid.model.LobidCorporateBody;

LobidObjectMapper lobidObjectMapper = new LobidObjectMapper();

URL url = URI.create("https://lobid.org/gnd/2004604-2.json").toURL();
LobidCorporateBody lobidCorporateBody = lobidObjectMapper.readValue(url, LobidCorporateBody.class);

String preferredName = lobidCorporateBody.getPreferredName();
```

## Generate new draft POJOs

Java POJOs are generated from JSON using `jsonschema2pojo` library, see <https://github.com/joelittlejohn/jsonschema2pojo>.

To generate POJO sources for example JSONs execute

```shell
$ mvn generate-sources -Pgenerate-pojos
```

- Example JSONs have to reside in `src/test/resources/examples` directory.
- Generated draft POJO class sources are in `target/jsonschema2pojo` directory.

Review draft POJOs and copy them to `src/main/java`, remove duplicates and give the classes the final shape.