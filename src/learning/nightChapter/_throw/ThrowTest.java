package learning.nightChapter._throw;

import learning.nightChapter.BelowZeroException;

public class ThrowTest {
    public static void main(String[] args) {
        try {
            throw new BelowZeroException();
        } catch (BelowZeroException e) {
            throw new RuntimeException(e);
        }
    }
}
