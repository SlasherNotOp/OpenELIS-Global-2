/**
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations under
 * the License.
 *
 * The Original Code is OpenELIS code.
 *
 * Copyright (C) ITECH, University of Washington, Seattle WA.  All Rights Reserved.
 *
 */

package org.openelisglobal.dataexchange.order.valueholder;

import java.sql.Timestamp;

import org.openelisglobal.common.valueholder.BaseObject;
import org.openelisglobal.common.valueholder.ValueHolder;
import org.openelisglobal.internationalization.MessageUtil;
import org.openelisglobal.patient.valueholder.Patient;
import org.openelisglobal.statusofsample.valueholder.StatusOfSample;

public class ElectronicOrder extends BaseObject<String> {

    public enum SortOrder {
        LAST_UPDATED("lastupdated", "eorder.lastupdated"), EXTERNAL_ID("externalId", "eorder.externalid"),
        STATUS_ID("statusId", "eorder.status");

        private String value;
        private String displayKey;

        public String getValue() {
            return value;
        }

        public String getLabel() {
            return MessageUtil.getMessage(displayKey);
        }

        SortOrder(String value, String displayKey) {
            this.value = value;
            this.displayKey = displayKey;
        }

        public static SortOrder fromString(String value) {
            for (SortOrder so : SortOrder.values()) {
                if (so.value.equalsIgnoreCase(value)) {
                    return so;
                }
            }
            return null;
        }
    }

    private static final long serialVersionUID = 5573858445160470854L;

    private String id;
    private String externalId;
    private ValueHolder patient;
    private String statusId;
    private StatusOfSample status; // not persisted
    private Timestamp orderTimestamp;
    private String data;

    public ElectronicOrder() {
        patient = new ValueHolder();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Patient getPatient() {
        return (Patient) patient.getValue();
    }

    public void setPatient(Patient patient) {
        this.patient.setValue(patient);
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public StatusOfSample getStatus() {
        return status;
    }

    public void setStatus(StatusOfSample status) {
        this.status = status;
    }

    public Timestamp getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Timestamp orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
