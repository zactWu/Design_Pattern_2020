package com.github.tongjisserollman.iceamusementpark.entertainment.facilitymanager.visitor;

/**
 * @author xuedixuedi
 */
public class FacilityUsage implements FacilityPart {
    /**
     * @param facilityPartVisitor 访问工具
     */
    @Override
    public void accept(FacilityPartVisitor facilityPartVisitor) {
        facilityPartVisitor.visit(this);
    }
}
