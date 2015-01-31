package npe1.stubs;


import com.google.common.base.Optional;

public class MilestoneDocument {

    public static enum DocType {
        ONE, TWO
    }

    public static enum DocVersion {
        OLD, NEW
    }

    public static Optional<MilestoneDocument> findDocumentOfVersion(DocType type, DocVersion version) {
        if(System.currentTimeMillis() % 5 == 0) {
            return Optional.of(new MilestoneDocument());
        }else {
            return null;
        }
    }
}
