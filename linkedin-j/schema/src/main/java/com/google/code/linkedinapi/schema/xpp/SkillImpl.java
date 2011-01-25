/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.google.code.linkedinapi.schema.xpp;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.google.code.linkedinapi.schema.NameType;
import com.google.code.linkedinapi.schema.Proficiency;
import com.google.code.linkedinapi.schema.Skill;
import com.google.code.linkedinapi.schema.Years;

public class SkillImpl
	extends BaseSchemaEntity
    implements Skill
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected ProficiencyImpl proficiency;
    protected YearsImpl years;
    protected String id;
    protected NameTypeImpl skill;

    public Proficiency getProficiency() {
        return proficiency;
    }

    public void setProficiency(Proficiency value) {
        this.proficiency = ((ProficiencyImpl) value);
    }

    public Years getYears() {
        return years;
    }

    public void setYears(Years value) {
        this.years = ((YearsImpl) value);
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public NameType getSkill() {
        return skill;
    }

    public void setSkill(NameType value) {
        this.skill = ((NameTypeImpl) value);
    }

	@Override
	public void init(XmlPullParser parser) throws IOException,
			XmlPullParserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
