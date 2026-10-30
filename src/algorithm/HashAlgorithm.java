package algorithm;

import java.io.IOException;
import java.io.InputStream;

public interface HashAlgorithm {

    String getName();

    String hash(InputStream input) throws IOException;
}