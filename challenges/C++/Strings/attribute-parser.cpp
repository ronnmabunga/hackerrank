#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;

int main() {
  // Taking the number of lines and queries
  int ls, qs;
  cin >> ls >> qs;

  // Processing the line inputs
  string tags[ls];
  vector<string> tagline;
  vector<string> parsedAttribs;
  vector<string> parsedValues;
  for (int i = 0; i < ls; i++) {
    // Reading the tag name on the line
    string temp;
    cin >> temp;
    bool noAttrib = false;
    // cout << "the temp val is :" <<temp;
    if (temp[1] == '/') {
      // If it is a closing tag, remove innermost tag, proceed to next line
      tagline.pop_back();
      continue;
    } else if (temp[temp.length() - 1] == '>') {
      // Check if there are no attributes, if yes proceed to next line
      temp = temp.substr(1, temp.length() - 2);
      if (tagline.empty()) {
        tagline.push_back(temp);
      } else {
        tagline.push_back("." + temp);
      }
      continue;
    } else {
      temp = temp.substr(1, temp.length() - 1);
      // Check if it's an inner tag, put a '.' prefix if yes.
      if (tagline.empty()) {
        tagline.push_back(temp);
      } else {
        tagline.push_back("." + temp);
      }
    }
    // cout << "tag obtained was: " << temp << endl;
    //  Reading the attributes+values pairs
    string attrib, eq, value;
    bool lastValue = false;
    while (true) {
      cin >> attrib >> eq >> value;
      // Adding the new attributes and values to the lists
      string parsed = "";
      for (int j = 0; j < tagline.size(); j++) {
        parsed = parsed + tagline.at(j);
      }
      parsed = parsed + "~" + attrib;
      if (value[value.length() - 1] == '>') {
        value = value.substr(1, value.length() - 3);
        lastValue = true;
      } else {
        value = value.substr(1, value.length() - 2);
      }
      // cout << "parsed: " << parsed << endl;
      // cout << "value: " << value << endl;
      parsedAttribs.push_back(parsed);
      parsedValues.push_back(value);

      // Check if last value, if yes proceed to next line
      if (lastValue) {
        break;
      }
    }
    // cout << "loop ended." <<endl;
  }
  // Processing the queries
  string tagquery;
  for (int i = 0; i < qs; i++) {
    cin >> tagquery;
    bool found = false;
    for (int j = 0; j < parsedAttribs.size(); j++) {
      // cout<<"tagquery: "<<tagquery<<" parsedAttribs.at(j):
      // "<<parsedAttribs.at(j)<<endl;
      if (tagquery.compare(parsedAttribs.at(j)) == 0) {
        cout << parsedValues.at(j) << endl;
        found = true;
      }
    }
    if (!found) {
      cout << "Not Found!" << endl;
    }
  }

  return 0;
}
