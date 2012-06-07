/* ********************************************************************
    Licensed to Jasig under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Jasig licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License. You may obtain a
    copy of the License at:

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on
    an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied. See the License for the
    specific language governing permissions and limitations
    under the License.
*/
package org.bedework.caldav.util.sharing;

import org.bedework.caldav.util.notifications.BaseNotificationType;

import edu.rpi.sss.util.ToString;

/** Class to represent reply to a sharing request.
 *
 * @author Mike Douglass douglm
 */
public class InviteNotificationType extends BaseNotificationType {
  private String uid;
  private String href;
  private String status;
  private AccessType access;
  private String hostUrl;
  private OrganizerType organizer;
  private String summary;

  /**
   * @param val the uid
   */
  public void setUid(final String val) {
    uid = val;
  }

  /**
   * @return the uid
   */
  public String getUid() {
    return uid;
  }

  /**
   * @param val the href
   */
  public void setHref(final String val) {
    href = val;
  }

  /**
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * @param val status
   */
  public void setStatus(final String val) {
    status = val;
  }

  /**
   * @return status
   */
  public String getStatus() {
    return status;
  }

  /**
   * @param val access
   */
  public void setAccess(final AccessType val) {
    access = val;
  }

  /**
   * @return access
   */
  public AccessType getAccess() {
    return access;
  }

  /**
   * @param val the hostUrl
   */
  public void setHostUrl(final String val) {
    hostUrl = val;
  }

  /**
   * @return the hostUrl
   */
  public String getHostUrl() {
    return hostUrl;
  }

  /**
   * @param val organizer
   */
  public void setOrganizer(final OrganizerType val) {
    organizer = val;
  }

  /**
   * @return organizer
   */
  public OrganizerType getOrganizer() {
    return organizer;
  }

  /**
   * @param val the summary
   */
  public void setSummary(final String val) {
    summary = val;
  }

  /**
   * @return the summary
   */
  public String getSummary() {
    return summary;
  }

  /* ====================================================================
   *                   Convenience methods
   * ==================================================================== */

  /** Add our stuff to the StringBuffer
   *
   * @param ts
   */
  protected void toStringSegment(final ToString ts) {
    ts.append("uid", getUid());
    ts.append("href", getHref());
    ts.append("status", getStatus());
    ts.append(getAccess().toString());
    ts.append("hostUrl", getHostUrl());
    ts.append("organizer", getOrganizer().toString());
    ts.append("summary", getSummary());
  }

  @Override
  public String toString() {
    ToString ts = new ToString(this);

    toStringSegment(ts);

    return ts.toString();
  }
}
