Feature: : US1002001 Checking sign up as a new client functionality.

@Smoke
Scenario Outline: As a user i sign up as a new client using informations in about you fields.
Given i am at City homepage
When i am clicking "<key1>"
Then i am selecting state
And i am selecting account option
Then i am clicking "<key5>"
And i am clicking "<key6>"
Then i am selecting "<key7>" "<value>"
And i am entering "<key9>" "<fname>"
Then i am entering "<key10>" "<Mname>"
And i am entering "<key11>" "<lname>"
Then i am entering "<key12>" "<email>"
And i am entering "<key13>" "<phone>"
Then i am entering "<key14>" "<address>"
And i am clicking "<key8>"
And i am clicking "<key15>"
Then i am clicking "<key16>"
And i am clicking "<key17>"
Then i am selecting "<key18>" "<type>"
And i am entering "<key20>" "<number>"
Then i am selecting "<key21>" "<state>"
And i am entering "<key23>" "<issue>"
Then i am entering "<key24>" "<exp>"
And i am selecting "<key25>" "<state1>"
Then i am entering "<key27>" "<dob>"
And i am entering "<key28>" "<ssn>"
And i am clicking "<key30>"
Then i am entering "<key31>" "<name>"
And i am entering "<key32>" "<scl>"
Then i am entering "<key33>" "<firname>"
And i am entering "<key34>" "<lasname>"
Then i am entering "<key35>" "<date>"
And i am clicking "<key36>"
Then i am clicking "<key37>"



Examples: 
|key1|key5|key6|key7|value|key9|fname|key10|Mname|key11|lname|key12|email|key13|phone|key14|address|key15|key16|key17|key18|type|key20|number|key21|state|key23|issue|key24|exp|key25|state1|key27|dob|key28|key30|key31|name|key32|scl|key33|fasname|key34|lasname|key35|date|key36|key37|
|key1|key5|key6|key7|Mr.|key9|steven|key10|J|key11|king|key12|noemail@gmail.com|key13|917-334-7364|key14|129-07,154th st,NY_11434|key15|key16|key17|key18|Driver's License|key20|78963275489283|key21|New York|key23|03-02-2015|key24|03-01-2020|key25|United States|key27|03-01-1991|key28|324-24-2424|key30|key31|dina|key32|ps22|key33|sdfg|key34|jkhdk|key35|13-05-2018|key36|key37|

