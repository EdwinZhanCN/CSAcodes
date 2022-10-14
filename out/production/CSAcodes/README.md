# CSAcodes
csa in-class code / Labratory
if(phrases.get(p2).getPartOfSpeech().equals("v")){
vrbCount++;
if(vrbCount < 2){translation[IndexOf(tag,tag[p1])] = phrases.get(p2).getChinese();p1++;continue;}
}else if(phrases.get(p2).getPartOfSpeech().equals("pron")){
pronCount++;
if(pronCount < 2){translation[IndexOf(tag,tag[p1])] = phrases.get(p2).getChinese();p1++;continue;}
}else if(phrases.get(p2).getPartOfSpeech().equals("mw")){
mw++;
if(mw < 2){translation[IndexOf(tag,tag[p1])] = phrases.get(p2).getChinese();p1++;continue;}
}