<h2><a href="https://codeforces.com/contest/1447/problem/B" target="_blank" rel="noopener noreferrer">1447B — Numbers Box</a></h2>

| | |
|---|---|
| **Difficulty** | 1000 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1447B](https://codeforces.com/contest/1447/problem/B) |

## Topics
`greedy` `math`

---

## Problem Statement

<div class="header"><div class="title">B. Numbers Box</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given a rectangular grid with $$$n$$$ rows and $$$m$$$ columns. The cell located on the $$$i$$$-th row from the top and the $$$j$$$-th column from the left has a value $$$a_{ij}$$$ written in it.</p><p>You can perform the following operation any number of times (possibly zero):</p><ul> <li> Choose any two adjacent cells and multiply the values in them by $$$-1$$$. Two cells are called adjacent if they share a side. </li></ul><p>Note that you can use a cell more than once in different operations.</p><p>You are interested in $$$X$$$, the <span class="tex-font-style-bf">sum</span> of all the numbers in the grid. </p><p>What is the maximum $$$X$$$ you can achieve with these operations?</p></div><div class="input-specification"><div class="section-title">Input</div><p>Each test contains multiple test cases. The first line contains the number of test cases $$$t$$$ ($$$1 \le t \le 100$$$). Description of the test cases follows.</p><p>The first line of each test case contains two integers $$$n$$$,$$$m$$$ ($$$2 \le n$$$, $$$m \le 10$$$). </p><p>The following $$$n$$$ lines contain $$$m$$$ integers each, the $$$j$$$-th element in the $$$i$$$-th line is $$$a_{ij}$$$ ($$$-100\leq a_{ij}\le 100$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each testcase, print one integer $$$X$$$, the maximum possible sum of all the values in the grid after applying the operation as many times as you want.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id00536859076022864" id="id008223200620652827" class="input-output-copier">Copy</div></div><pre id="id00536859076022864">2
2 2
-1 1
1 1
3 4
0 -1 -2 -3
-1 -2 -3 -4
-2 -3 -4 -5
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id005003955161494874" id="id0001699010815084845" class="input-output-copier">Copy</div></div><pre id="id005003955161494874">2
30
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, there will always be at least one $$$-1$$$, so the answer is $$$2$$$. </p><p>In the second test case, we can use the operation six times to elements adjacent horizontally and get all numbers to be non-negative. So the answer is: $$$2\times 1 + 3\times2 + 3\times 3 + 2\times 4 + 1\times 5 = 30$$$.</p></div>