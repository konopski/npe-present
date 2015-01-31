package options;

import com.google.common.base.Optional;
import npe1.stubs.MilestoneDocument.DocType;
import npe1.stubs.MilestoneDocument.DocVersion;
import npe1.stubs.MilestoneDocument;
import static npe1.stubs.MilestoneDocument.findDocumentOfVersion;

public class Eval {

    private static MilestoneDocument findDocOfVer(DocType documentType, DocVersion documentVersion) {
        final Optional<MilestoneDocument> documentOfVersion = findDocumentOfVersion(documentType, documentVersion);
        if (documentOfVersion == null) {
            throw new IllegalStateException();
        }
        if (documentOfVersion.isPresent()) {
            return documentOfVersion.get();
        }
        return null;
    }

    public MilestoneDocument doSth(Optional<MilestoneDocument> tipDocument) {
        if (tipDocument.isPresent()) {
            return tipDocument.get();
        }
        return null;
    }

    public MilestoneDocument doSthBetter(Optional<MilestoneDocument> tipDocument) {
        return tipDocument.orNull();
    }
}
