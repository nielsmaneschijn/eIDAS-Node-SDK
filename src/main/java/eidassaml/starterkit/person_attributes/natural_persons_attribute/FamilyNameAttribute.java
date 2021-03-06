/* 
 * 
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 * 
 * Date: 09 Feb 2016
 * Authors: Governikus GmbH & Co. KG
 * 
*/
package eidassaml.starterkit.person_attributes.natural_persons_attribute;

import eidassaml.starterkit.EidasAttribute;
import eidassaml.starterkit.EidasNaturalPersonAttributes;
import eidassaml.starterkit.Utils;
import eidassaml.starterkit.person_attributes.AbstractAttribute;
import eidassaml.starterkit.person_attributes.EidasPersonAttributes;

public class FamilyNameAttribute extends AbstractAttribute {

	public FamilyNameAttribute(){}

	public FamilyNameAttribute(String value, String transliteratedValue) {
		super(value,transliteratedValue);
	}
	
	public FamilyNameAttribute(String value) {
		super(value);
	}

	@Override
	public String getTemplateName() {
		return Utils.IsNullOrEmpty(getTransliteratedValue()) ? "familyname" : "familyname_transliterated";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return EidasAttribute.TYPE_FamilyName;
	}

	@Override
	public EidasPersonAttributes getPersonAttributeType() {
		// TODO Auto-generated method stub
		return EidasNaturalPersonAttributes.FamilyName;
	}
	
	@Override
	public String toString() {
		return type() + " " + this.getValue();
	}

}
