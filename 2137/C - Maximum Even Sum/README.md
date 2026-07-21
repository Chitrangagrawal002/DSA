<h2><a href="https://codeforces.com/contest/2137/problem/C" target="_blank" rel="noopener noreferrer">2137C — Maximum Even Sum</a></h2>

| | |
|---|---|
| **Difficulty** | 1100 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2137C](https://codeforces.com/contest/2137/problem/C) |

## Topics
`brute force` `greedy` `implementation` `math`

---

## Problem Statement

<div class="header"><div class="title">C. Maximum Even Sum</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given two integers $$$a$$$ and $$$b$$$. You are to perform the following procedure:</p><p>First, you choose an integer $$$k$$$ such that $$$b$$$ is divisible by $$$k$$$. Then, you simultaneously multiply $$$a$$$ by $$$k$$$ and divide $$$b$$$ by $$$k$$$.</p><p>Find the greatest possible <span class="tex-font-style-bf">even</span> value of $$$a+b$$$. If it is impossible to make $$$a+b$$$ even, output $$$-1$$$ instead.</p></div><div class="input-specification"><div class="section-title">Input</div><p>Each test contains multiple test cases. The first line contains the number of test cases $$$t$$$ ($$$1 \le t \le 10^4$$$). The description of the test cases follows. </p><p>The first line of each test case contains two integers $$$a$$$ and $$$b$$$ ($$$1 \leq a,b \leq a\cdot b \leq 10^{18})$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output the maximum <span class="tex-font-style-bf">even</span> value of $$$a+b$$$ on a new line.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0009537785963117118" id="id005859660234109425" class="input-output-copier">Copy</div></div><pre id="id0009537785963117118"><div class="test-example-line test-example-line-even test-example-line-0">7</div><div class="test-example-line test-example-line-odd test-example-line-1">8 1</div><div class="test-example-line test-example-line-even test-example-line-2">1 8</div><div class="test-example-line test-example-line-odd test-example-line-3">7 7</div><div class="test-example-line test-example-line-even test-example-line-4">2 6</div><div class="test-example-line test-example-line-odd test-example-line-5">9 16</div><div class="test-example-line test-example-line-even test-example-line-6">1 6</div><div class="test-example-line test-example-line-odd test-example-line-7">4 6</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id00029901360529640097" id="id0021760169755580894" class="input-output-copier">Copy</div></div><pre id="id00029901360529640097">-1
6
50
8
74
-1
14
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, it can be shown it is impossible for $$$a+b$$$ to be even.</p><p>In the second test case, the optimal $$$k$$$ is $$$2$$$. The sum is $$$2+4=6$$$.</p></div>