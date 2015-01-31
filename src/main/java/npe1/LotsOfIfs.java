package npe1;

import npe1.stubs.LanguageFacade;
import npe1.stubs.Logger;
import npe1.stubs.Student;
import npe1.stubs.StudentFacade;

import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;

public class LotsOfIfs {

    private static Hashtable portalSkinMappings = new Hashtable();

    public static Student buildStudentFromHashtable(Hashtable hash, String portal)
    {
        Student s = null;
        if ( hash.get("userCorporationUserid") != null && !hash.get("userCorporationUserid").equals("") )
        {
            try
            {
                s = StudentFacade.getStudentByUsername((String) hash.get("userCorporationUserid"));
            }
            catch ( Exception e )
            {
                Logger.getInstance().writeToLog(e);
            }
        }

        if ( s == null )
            s = new Student();
        if ( hash.get("userCorporationUserid") != null )
            s.setUsername((String) hash.get("userCorporationUserid"));
        else
            s.setUsername("");

        if ( hash.get("userfirstname") != null )
            s.setFname((String) hash.get("userfirstname"));
        else if ( s.getFname() == null || s.getFname().equals("") )
            s.setFname("unknown");

        if ( hash.get("userlastname") != null )
            s.setLname((String) hash.get("userlastname"));
        else if ( s.getLname() == null || s.getLname().equals("") )
            s.setLname("unknown");

        if ( hash.get("useremailaddress") != null && !((String) hash.get("useremailaddress")).equals("") )
            s.setEmail((String) hash.get("useremailaddress"));
        else if ( s.getEmail() == null || s.getEmail().indexOf('@') <= 0 || s.getEmail().startsWith("unavailable-unavailable") )
        {
            if ( hash.get("username") != null && ((String) hash.get("username")).indexOf('@') > 0 )
                s.setEmail((String) hash.get("username"));
            else if ( hash.get("employeremail") != null && ((String) hash.get("employeremail")).indexOf('@') > 0 )
                s.setEmail((String) hash.get("employeremail"));
            else
                s.setEmail("");
        }

        if ( hash.get("userphone") != null && !hash.get("userphone").equals("") )
            s.setPhone((String) hash.get("userphone"));
        else if ( hash.get("employerphone") != null && !hash.get("employerphone").equals("") )
            s.setPhone((String) hash.get("employerphone"));
        else if ( s.getPhone() == null )
            s.setPhone("");

        if ( hash.get("usertitle") != null )
            s.setTitel((String) hash.get("usertitle"));
        else if ( s.getTitel() == null )
            s.setTitel("");

        String prio1 = portal.equalsIgnoreCase("PARTNERS") ? "employer" : "user";
        String prio2 = portal.equalsIgnoreCase("PARTNERS") ? "user" : "employer";
        String userAddr = (String) hash.get("useraddress");
        String employerAddr = (String) hash.get("employerstreetaddress");
        if ( prio1.equals("user") && userAddr != null && !userAddr.equals("") )
            s.setAddress(userAddr);
        else if ( employerAddr != null && !"".equals(employerAddr))
            s.setAddress(employerAddr);
        else if ( userAddr != null && !userAddr.equals("") )
            s.setAddress(userAddr);
        else if ( s.getAddress() == null )
            s.setAddress("");

        if ( hash.get(prio1 + "city") != null && !((String) hash.get(prio1 + "city")).equals("") )
            s.setTown((String) hash.get(prio1 + "city"));
        else if ( hash.get(prio2 + "city") != null )
            s.setTown((String) hash.get(prio2 + "city"));
        else if ( s.getTown() == null )
            s.setTown("");

        if ( hash.get(prio1 + "state") != null && !((String) hash.get(prio1 + "state")).equals("") )
            s.setState((String) hash.get(prio1 + "state"));
        else if ( hash.get(prio2 + "state") != null )
            s.setState((String) hash.get(prio2 + "state"));
        else if ( s.getState() == null )
            s.setState("");

        if ( hash.get(prio1 + "country") != null && !((String) hash.get(prio1 + "country")).equals("") )
            s.setCountry((String) hash.get(prio1 + "country"));
        else if ( hash.get(prio2 + "country") != null )
            s.setCountry((String) hash.get(prio2 + "country"));
        else if ( s.getCountry() == null )
            s.setCountry("");

        if ( hash.get(prio1 + "zipcode") != null && !((String) hash.get(prio1 + "zipcode")).equals("") )
            s.setZipcode((String) hash.get(prio1 + "zipcode"));
        else if ( hash.get(prio2 + "zipcode") != null )
            s.setZipcode((String) hash.get(prio2 + "zipcode"));
        else if ( s.getZipcode() == null )
            s.setZipcode("");

        if ( hash.get("employername") != null )
            s.setCompany((String) hash.get("employername"));
        else if ( s.getCompany() == null )
            s.setCompany("");

        String language = portal.equalsIgnoreCase("PARTNERS") ? "en_US" : "en_GB";
        String extranet = (String) hash.get("userpreferredextranet");
        extranet = extranet != null ? extranet : "";
        if ( extranet.endsWith("/us/en") )
            language = "en_US";
        else if ( extranet.endsWith("/en") )
            language = "en_GB";
        else
        {
            try
            {
                String lang = "en_GB";
                if(extranet.indexOf('/') > -1) {
                    lang = extranet.substring(extranet.lastIndexOf('/'), extranet.length());
                }
                Vector codes = LanguageFacade.getLanguageCodesByLanguage(lang);
                if ( codes.size() > 0 )
                    language = (String) codes.get(1);
            }
            catch ( Exception e )
            {
                Logger.getInstance().writeToLog(e);
            }
        }
        s.setLanguage(language);
        if(portalSkinMappings.containsKey(portal.toUpperCase())) {
            s.setStyle(portalSkinMappings.get(portal.toUpperCase()));
        } else {
            s.setStyle("default");
        }


        if ( s.getStudentid() == 0 )
        {
            s.setApproved("Y");
            s.setRegdate(new Date());
            s.setRoleid(1);
            s.setExamjobroleid("0");
            s.setUniqueidentifier("0");
            s.setPassword("S3CR3T");
        }
        return s;
    }
}
