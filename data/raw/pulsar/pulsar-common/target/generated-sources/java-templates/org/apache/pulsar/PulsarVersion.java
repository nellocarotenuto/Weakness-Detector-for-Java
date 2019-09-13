/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pulsar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PulsarVersion {

    private static final Pattern majorMinorPatchPattern = Pattern.compile("([0-9]+)\\.([0-9]+)\\.([0-9]+)(.*)");

    // Pattern for version missing the patch number: eg: 1.14-SNAPSHOT
    private static final Pattern majorMinorPatter = Pattern.compile("([0-9]+)\\.([0-9]+)(.*)");

    // If the version string does not contain a patch version, add one so the
    // version becomes valid according to the SemVer library (see https://github.com/zafarkhaja/jsemver).
    // This method (and it's only call above in the ctor) may be removed when SemVer accepts null patch versions
    static String fixVersionString(String version) {
        if ( null == version ) {
            return null;
        }

        Matcher majorMinorPatchMatcher = majorMinorPatchPattern.matcher(version);

        if ( majorMinorPatchMatcher.matches() ) {
            // this is a valid version, containing a major, a minor, and a patch version (and optionally
            // a release candidate version and/or build metadata)
            return version;
        } else {
            // the patch version is missing, so add one ("0")
            Matcher matcher2 = majorMinorPatter.matcher(version);

            if (matcher2.matches()) {
                int startMajorVersion = matcher2.start(1);
                int stopMinorVersion = matcher2.end(2);
                int startReleaseCandidate = matcher2.start(3);

                String prefix = new String(version.getBytes(), startMajorVersion, (stopMinorVersion-startMajorVersion));
                String patchVersion = ".0";
                String suffix = new String(version.getBytes(), startReleaseCandidate, version.length() - startReleaseCandidate);

                return (prefix + patchVersion + suffix);
            } else {
                // This is an invalid version, let the JSemVer library fail when it parses it
                return version;
            }
        }
    }

    public static String getVersion() {
        return fixVersionString("2.4.1");
    }

    public static String getGitSha() {
        String commit = "cc746322d51cea14b04092370bcebf695721fe70";
        String dirtyString = "false";
        if (dirtyString == null || Boolean.valueOf(dirtyString)) {
            return commit + "(dirty)";
        } else {
            return commit;
        }
    }

    public static String getBuildUser() {
        String email = "nello.carotenuto.96@live.com";
        String name = "Nello Carotenuto";
        return String.format("%s <%s>", name, email);
    }

    public static String getBuildHost() {
        return "LAPTOP-5AIG1SRO";
    }

    public static String getBuildTime() {
        return "2019-09-11T19:48:37+0200";
    }
}
